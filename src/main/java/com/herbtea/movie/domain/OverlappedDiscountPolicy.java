package com.herbtea.movie.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappedDiscountPolicy implements DiscountPolicy{
    private List<DiscountPolicy> discountPolicies = new ArrayList<>();

    public OverlappedDiscountPolicy(DiscountPolicy... discountPolicies) {
        this.discountPolicies = Arrays.asList(discountPolicies);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        Money result = Money.ZERO;
        for(DiscountPolicy each : discountPolicies) {
            result = each.calculateDiscountAmount(screening);
        }
        return result;
    }
}

package com.herbtea.movie.domain;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}

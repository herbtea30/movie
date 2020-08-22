package com.herbtea.movie.domain;

public interface DiscountCondition {
    public boolean isSatisfiedBy(Screening screening);
}

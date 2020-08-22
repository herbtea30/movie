package com.herbtea.movie.domain;

public class Reservation {
    private Custommer custommer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Custommer custommer, Screening screening, Money fee, int audienceCount) {
        this.custommer = custommer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}

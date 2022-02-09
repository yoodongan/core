package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    private final int discount  = 10; // 할인율 10%를 의미.

    public int discount(Member member, int price){
        if (member.getGrade() == Grade.VIP){
            return price * discount / 100;
        }
        else {
            return 0;
        }
    }
}

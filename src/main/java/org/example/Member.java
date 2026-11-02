package org.example;


public class Member {

    private String memberId;
    private String memberName;
    private int memberAge;

    public Member(String memberId, String memberName, int memberAge) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAge = memberAge;
    }
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public int getMemberAge() {
        return memberAge;
    }
    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }


}


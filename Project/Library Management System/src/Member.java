
public class Member {
    private String memberId;
    private String name;


    Member(String memberId, String name){
        this.memberId = memberId;
        this.name = name;
    }

    //Get & Set Member ID
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    //Get & Set Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

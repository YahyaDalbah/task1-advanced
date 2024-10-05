// Bonus Task
public class Member {
    private String name;
    private String membershipId;

    public Member(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for membershipId
    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    // Display member info
    public void displayMemberInfo() {
        System.out.println("Member Name: " + name + ", Membership ID: " + membershipId);
    }
}

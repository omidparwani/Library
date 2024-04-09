public class Member {
    private String name;
    private String memberId;
    // Consider adding more properties like a list of borrowed books

    public Member(String name) {
        this.name = name;
        this.memberId = generateMemberId();
    }

    private String generateMemberId() {
        // Generate a unique ID for the member
        return "M" + System.currentTimeMillis(); // Simplified approach
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    // Additional methods as needed
}

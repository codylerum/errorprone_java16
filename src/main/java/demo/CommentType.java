package demo;

public enum CommentType {

    INTERNAL("Internal"),
    EXTERNAL("External");

    private final String displayName;

    CommentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

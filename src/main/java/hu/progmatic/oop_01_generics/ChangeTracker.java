package hu.progmatic;

public class ChangeTracker {
    private Object lastVersion;
    private int changes;

    public void addVersion(Object version) {
        if (lastVersion == null || !lastVersion.equals(version)) {
            changes++;
        }

        lastVersion = version;
    }

    public Object getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(Object lastVersion) {
        this.lastVersion = lastVersion;
    }

    public int getChanges() {
        return changes;
    }

    public void setChanges(int changes) {
        this.changes = changes;
    }
}

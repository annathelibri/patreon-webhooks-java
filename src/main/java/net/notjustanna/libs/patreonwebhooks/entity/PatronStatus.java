package net.notjustanna.libs.patreonwebhooks.entity;

public enum PatronStatus {
    ACTIVE_PATREON,
    DECLINED_PATREON,
    FORMER_PATREON;

    public static PatronStatus forStatus(String status) {
        for (PatronStatus value : values()) {
            if (value.name().toLowerCase().equals(status)) return value;
        }

        return null;
    }
}

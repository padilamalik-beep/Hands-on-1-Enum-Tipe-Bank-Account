public enum AccountType {
    SAVINGS("Tabungan"), CREDIT("Kredit"), DEPOSIT("Deposito");
    private final String description;
    AccountType(String description) { this.description = description; }
    @Override public String toString() { return description; }
}

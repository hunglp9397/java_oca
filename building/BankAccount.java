package building;

public class BankAccount {
    String acctNumber;
    int acctType;

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof BankAccount) {
            BankAccount compareObj = (BankAccount) obj;
            return (acctNumber.equals(compareObj.acctNumber) &&
                    acctType == compareObj.acctType);
        } else
            return false;

    }
}


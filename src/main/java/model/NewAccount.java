package model;

import io.cucumber.java.DataTableType;

import java.util.Map;

/**
 * Created by vietluong on 8/13/2018.
 */
public class NewAccount {
    private String customerId;
    private String accountType;
    private String initialDeposit;


    public NewAccount(String customerId, String accountType, String initialDeposit) {
        this.customerId = customerId;
        this.accountType = accountType;
        this.initialDeposit = initialDeposit;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(String initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    @DataTableType
    public NewAccount newAccountEntry(Map<String, String> entry) {
        return new NewAccount(entry.get("customerId"), entry.get("accountType"), entry.get("initialDeposit"));
    }
}

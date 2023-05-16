package br.com.financialtransactions.financialtransactions.Controller;

import br.com.financialtransactions.financialtransactions.Model.Financial;

import javax.faces.bean.ManagedBean;
import java.util.Date;

@ManagedBean
public class FinancialMemoryDataBase {
    Financial financial = new Financial();

    public FinancialMemoryDataBase(){}

    public String getCode() {
        return String.valueOf(financial.getId());
    }

    public void setCode(String code) {
        financial.setId(Integer.parseInt(code));
    }

    public String getTransactionDate() {
        return String.valueOf(financial.getTransactionDate());
    }

    public void setTransactionDate(Date transactionDate) {
        financial.setTransactionDate(transactionDate);
    }

    public String getTransactionType() {
        return financial.getTransactionType();
    }

    public void setTransactionType(String transactionType) {
        financial.setTransactionType(transactionType);
    }

    public String getClientAccount() {
        return financial.getClientAccount();
    }

    public void setClientAccount(String clientAccount) {
        financial.setClientAccount(clientAccount);
    }

    public Financial getFinancial() {
        return financial;
    }

    public void setFinancial(Financial financial) {
        this.financial = financial;
    }
}

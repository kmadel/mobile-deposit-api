package com.cloudbees.example.mobile.deposit.api;

/**
 * Created by kmadel on 6/12/15.
 */

import com.cloudbees.example.mobile.deposit.api.model.Deposit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.math.BigDecimal;


@Component
@Path("/account/deposit")
public class DepositEndpoint {

    @GET
    public Deposit getDepositAccount() {



        Deposit depositAccount = new Deposit();
        depositAccount.setAccountNumber("XXXX9876");
        depositAccount.setBalance(new BigDecimal(8760.85));
        depositAccount.setVersion("2.0");
        depositAccount.setName("Free Checking");

        return depositAccount;
    }

}
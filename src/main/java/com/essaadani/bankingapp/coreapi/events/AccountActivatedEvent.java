package com.essaadani.bankingapp.coreapi.events;

import com.essaadani.bankingapp.coreapi.enums.AccountStatus;
import lombok.Getter;

public class AccountActivatedEvent extends BaseEvent<String>{
    @Getter private AccountStatus status;

    public AccountActivatedEvent(AccountStatus status) {
        this.status = status;
    }
}

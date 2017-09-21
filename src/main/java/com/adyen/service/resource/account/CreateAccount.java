package com.adyen.service.resource.account;

import java.util.Arrays;
import com.adyen.Service;
import com.adyen.service.Resource;

public class CreateAccount extends Resource {

    public CreateAccount(Service service) {
        super(service,
                service.getClient().getConfig().getMarketPayEndpoint() + "/Account/" + service.getClient().getMarketPayApiVersion() + "/createAccount",
                Arrays.asList(
                        "accountHolderCode"
                )
        );
    }
}

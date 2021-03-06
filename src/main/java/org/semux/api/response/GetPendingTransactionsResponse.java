/**
 * Copyright (c) 2017-2018 The Semux Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.semux.api.response;

import java.util.List;

import org.semux.api.ApiHandlerResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPendingTransactionsResponse extends ApiHandlerResponse {

    @JsonProperty("result")
    public final List<Types.TransactionType> pendingTransactions;

    public GetPendingTransactionsResponse(
            @JsonProperty("success") Boolean success,
            @JsonProperty("result") List<Types.TransactionType> pendingTransactions) {
        super(success, null);
        this.pendingTransactions = pendingTransactions;
    }
}

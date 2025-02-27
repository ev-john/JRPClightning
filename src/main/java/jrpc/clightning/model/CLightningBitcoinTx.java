/**
 * Copyright 2019 Vincenzo Palazzo vincenzopalazzodev@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jrpc.clightning.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author https://github.com/vincenzopalazzo
 */
public class CLightningBitcoinTx {

    //TODO Testing this command because I have the different Behaviors
    //Look also the reference https://github.com/ElementsProject/lightning/blob/master/doc/lightning-withdraw.7.md
    @SerializedName("unsigned_tx")
    private String unsignedTx;
    @SerializedName("txid")
    private String txId;

    public String getUnsignedTx() {
        return unsignedTx;
    }

    public String getTxId() {
        return txId;
    }
}

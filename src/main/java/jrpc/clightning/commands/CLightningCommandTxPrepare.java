/**
 * Copyright 2019 https://github.com/vincenzopalazzo
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
package jrpc.clightning.commands;

import com.google.gson.reflect.TypeToken;
import jrpc.clightning.model.CLightningBitcoinTx;
import jrpc.wrapper.response.RPCResponseWrapper;

import java.lang.reflect.Type;

/**
 * @author https://github.com/vincenzopalazzo
 */
class CLightningCommandTxPrepare extends AbstractRPCCommand<CLightningBitcoinTx>{

    private static final String COMMAND_NAME = "txprepare";

    public CLightningCommandTxPrepare() {
        super(COMMAND_NAME);
    }

    @Override
    protected Type toTypeFromClass() {
        return new TypeToken<RPCResponseWrapper<CLightningBitcoinTx>>(){}.getType();
    }
}

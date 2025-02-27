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
package jrpc.wrapper.response;

import com.google.gson.annotations.SerializedName;

/**
 * @author https://github.com/vincenzopalazzo
 */
public class RPCResponseWrapper<T> {

    private float jsonrpc;
    private int id;
    private T result;
    private ErrorResponse error;

    public float getJsonrpc() {
        return jsonrpc;
    }

    public int getId() {
        return id;
    }

    public T getResult() {
        return result;
    }

    public ErrorResponse getError() {
        return error;
    }
}

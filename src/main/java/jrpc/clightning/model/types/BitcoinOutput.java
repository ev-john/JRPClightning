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
package jrpc.clightning.model.types;

/**
 * @author https://github.com/vincenzopalazzo
 */
public class BitcoinOutput {

    private String address;
    private String ammount;

    public BitcoinOutput() {}

    public BitcoinOutput(String address, String ammount) {
        this.address = address;
        this.ammount = ammount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        String ammountString;
        if(ammount.trim().isEmpty()){
            ammountString = "all";
        }else{
            ammountString = ammount;
        }
        return address + "#" + ammountString;
    }
}

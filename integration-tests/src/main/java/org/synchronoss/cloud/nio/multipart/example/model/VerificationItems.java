/*
 * Copyright (C) 2015 Synchronoss Technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.synchronoss.cloud.nio.multipart.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> A list of {@code VerificationItem}
 *
 * @author Silvano Riz.
 */
public class VerificationItems {

    private List<VerificationItem> verificationItems = new ArrayList<VerificationItem>();

    public List<VerificationItem> getVerificationItems() {
        return verificationItems;
    }

    public void setVerificationItems(List<VerificationItem> verificationItems) {
        this.verificationItems = verificationItems;
    }
}

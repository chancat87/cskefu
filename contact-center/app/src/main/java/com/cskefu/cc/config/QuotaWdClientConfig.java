/*
 * Copyright (C) 2023 Beijing Huaxia Chunsong Technology Co., Ltd.
 * <https://www.chatopera.com>, Licensed under the Chunsong Public
 * License, Version 1.0  (the "License"), https://docs.cskefu.com/licenses/v1.html
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Copyright (C) 2019-2022 Chatopera Inc, <https://www.chatopera.com>,
 * Licensed under the Apache License, Version 2.0,
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package com.cskefu.cc.config;

import com.chatopera.store.sdk.QuotaWdClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuotaWdClientConfig {

    @Value("${cskefu.license.store}")
    private String cskefuLicenseStore;

    /**
     * 证书商店服务客户端
     *
     * @return
     */
    @Bean
    public QuotaWdClient quotaWdClient() {
        QuotaWdClient quotaWdClient = new QuotaWdClient();
        quotaWdClient.setBaseUrl(cskefuLicenseStore);
        return quotaWdClient;
    }
}

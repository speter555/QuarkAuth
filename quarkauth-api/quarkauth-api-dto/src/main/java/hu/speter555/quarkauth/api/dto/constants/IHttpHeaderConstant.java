/*-
 * #%L
 * QuarkAuth
 * %%
 * Copyright (C) 2024 Speter555
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package hu.speter555.quarkauth.api.dto.constants;

import hu.icellmobilsoft.coffee.dto.common.LogConstants;

/**
 * Basic REST HTTP header constants
 *
 * @author speter555
 * @since 0.1.0
 */

public interface IHttpHeaderConstant {
    /**
     * Session identifier over service. Value is main part of logging
     */
    String HEADER_SID = LogConstants.LOG_SESSION_ID;

    /**
     * Authentication session token
     */
    String HEADER_SESSION_TOKEN = "sessionToken";

    /**
     * Authentication refresh token
     */
    String HEADER_REFRESH_TOKEN = "refreshToken";

    /**
     * Application language
     */
    String HEADER_LANGUAGE = "X-LANGUAGE";


}

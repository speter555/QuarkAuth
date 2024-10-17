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
package hu.speter555.quarkauth.api.dto.exceptions;

import hu.icellmobilsoft.coffee.se.api.exception.BusinessException;
import hu.icellmobilsoft.coffee.se.api.exception.enums.CoffeeFaultType;

/**
 * Specific Business exception
 *
 * @author speter555
 * @since 0.1.0
 */
public class QuarkAuthBusinessException extends BusinessException {

    private static final long serialVersionUID = -6095346128924046090L;

    /**
     * Constructor for QuarkAuthBusinessException.
     *
     * @param message message
     */
    public QuarkAuthBusinessException(String message) {
        this(CoffeeFaultType.OPERATION_FAILED, message, null);
    }

    /**
     * Constructor for QuarkAuthBusinessException.
     *
     * @param faultTypeEnum faultTypeEnum
     * @param message       message
     */
    public QuarkAuthBusinessException(Enum<?> faultTypeEnum, String message) {
        this(faultTypeEnum, message, null);
    }

    /**
     * Constructor for QuarkAuthBusinessException.
     *
     * @param faultTypeEnum faultTypeEnum
     * @param message       message
     * @param e             e
     */
    public QuarkAuthBusinessException(Enum<?> faultTypeEnum, String message, Throwable e) {
        super(faultTypeEnum, message, e);
    }

}

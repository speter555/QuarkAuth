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
package hu.speter555.quarkauth.api.jakarta.system.versioninfo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;

import hu.icellmobilsoft.coffee.se.api.exception.BaseException;
import hu.speter555.quarkauth.api.jakarta.path.ServicePath;

@Path(ServicePath.VERSION_INFO)
public interface ISystemVersionInfoRest {

    /**
     * Version info
     *
     * @return version infos in plain text
     * @throws BaseException if any error occurs
     */
    @Operation(hidden = true)
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String versionInfo() throws BaseException;
}

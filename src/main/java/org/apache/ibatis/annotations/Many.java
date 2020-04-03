/**
 * Copyright 2009-2020 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.ibatis.mapping.FetchType;

/**
 * The annotation that specify the nested statement for retrieving collections.
 *
 * @author Clinton Begin
 * @see Result
 * @see Results
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({})
public @interface Many {
    /**
     * Returns the columnPrefix.
     *
     * @return the columnPrefix.
     * @since 3.5.5
     */
    String columnPrefix() default "";

    /**
     * Returns the result map id used to map collection.
     *
     * @return the result map id
     * @since 3.5.5
     */
    String resultMap() default "";

    /**
     * Returns the statement id that retrieves collection.
     *
     * @return the statement id
     */
    String select() default "";

    /**
     * Returns the fetch strategy for nested statement.
     *
     * @return the fetch strategy
     */
    FetchType fetchType() default FetchType.DEFAULT;

}

/*
 * Copyright 2014-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.outsidesql.typed;

import org.dbflute.cbean.paging.PagingBean;

/**
 * The parameter-bean for auto-paging handling.
 * @author jflute
 * @param <BEHAVIOR> The type of a corresponding behavior.
 * @param <ENTITY> The type of an entity (may be scalar) for result.
 */
public interface AutoPagingHandlingPmb<BEHAVIOR, ENTITY> extends TypedSelectPmb<BEHAVIOR, ENTITY>, PagingBean {
}

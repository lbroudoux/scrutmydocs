/*
 * Licensed to scrutmydocs.org (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.scrutmydocs.webapp.helpers;

import java.io.IOException;
import java.util.Map;

import org.elasticsearch.common.xcontent.XContentBuilder;
import org.scrutmydocs.webapp.api.settings.rivers.data.BasicRiver;

public class RiverHelper extends AbstractRiverHelper<BasicRiver> {

	@Override
	public XContentBuilder addMeta(XContentBuilder xcb, BasicRiver river) throws IOException {
		return xcb;
	}


	/**
	 * We build "dummy" rivers.
	 */
	@Override
	public String type() {
		return "dummy";
	}


	@Override
	public BasicRiver parseMeta(BasicRiver river, Map<String, Object> content) {
		return river;
	}	

}
/**
 * Copyright (c) 2003-2011 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.lessonbuildertool;

import java.util.Date;

public interface SimplePageComment {
	
	public long getId();
	public void setId(long id);
	
	public long getItemId();
	public void setItemId(long itemId);
	
	public long getPageId();
	public void setPageId(long pageId);
	
	public Date getTimePosted();
	public void setTimePosted(Date date);
	
	public String getAuthor();
	public void setAuthor(String author);
	
	public String getComment();
	public void setComment(String comment);
	
	public String getUUID();
	public void setUUID(String UUID);
	
	public boolean getHtml();
	public void setHtml(boolean html);
	
	public int compareTo(Object o);
	
	public Double getPoints();
	public void setPoints(Double points);
	
}

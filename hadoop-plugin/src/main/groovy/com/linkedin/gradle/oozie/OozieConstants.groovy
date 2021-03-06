/*
 * Copyright 2015 LinkedIn Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.linkedin.gradle.oozie;

final class OozieConstants {
  /**
   * The URI of the cluster e.g. webhdfs://theNameNode.linkedin.com:50070.
   */
  public static final String OOZIE_CLUSTER_URI = "clusterURI";

  /**
   * The URI of the Oozie system to interact with e.g. http://theOozieNode.linkedin.com:11000/oozie/.
   */
  public static final String OOZIE_SYSTEM_URI = "oozieURI";

  /**
   * The name of the project. A directory will be created at PATH_TO_UPLOAD with this name.
   */
  public static final String OOZIE_PROJECT_NAME = "projectName";

  /**
   * The name of the zipTask e.g. azkabanHadoopZip.
   */
  public static final String OOZIE_ZIP_TASK = "oozieZipTask";

  /**
   * The path where project directory must be created e.g.
   * webhdfs://theNameNode.linkedin.com:50070/user/annag.
   */
  public static final String PATH_TO_UPLOAD = "uploadPath";
}

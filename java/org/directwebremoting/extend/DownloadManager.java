/*
 * Copyright 2005 Joe Walker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.directwebremoting.extend;

import java.io.IOException;
import java.io.OutputStream;

/**
 * A DownloadManager allows you to inject files into the system and then
 * retrieve them via a servlet at some later date.
 * @author Joe Walker [joe at getahead dot ltd dot uk]
 */
public interface DownloadManager
{
    /**
     * Inject a file into the system for later download.
     * @param generator The representation of the file to inject
     * @return A URL for how to allow download of this data at a later time
     * @throws IOException If there are problems reading from the {@link FileGenerator}
     */
    String addFile(FileGenerator generator) throws IOException;

    /**
     * Retrieve a file previously injected into the system with
     * {@link #addFile(org.directwebremoting.extend.DownloadManager.FileGenerator)}
     * @param id The id of the {@link FileGenerator} to retrieve
     */
    FileGenerator getFile(String id);

    /**
     * A representation of the file that we are writing out.
     */
    public static interface FileGenerator
    {
        /**
         * Write the file to the give {@link OutputStream}.
         * The system will take care of opening and closing the stream
         * @param out The stream to write to.
         * @throws IOException If there are creation problems
         */
        void generateFile(OutputStream out) throws IOException;

        /**
         * What is the MimeType for the given file
         * @return a valid mime-type
         */
        String getMimeType();
    }
}
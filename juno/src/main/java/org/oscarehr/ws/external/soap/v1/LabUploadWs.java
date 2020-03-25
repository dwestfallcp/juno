/**
 * Copyright (c) 2001-2002. Department of Family Medicine, McMaster University. All Rights Reserved.
 * This software is published under the GPL GNU General Public License.
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 * This software was written for the
 * Department of Family Medicine
 * McMaster University
 * Hamilton
 * Ontario, Canada
 */

package org.oscarehr.ws.external.soap.v1;

import org.apache.commons.io.FileUtils;
import org.apache.cxf.annotations.GZIP;
import org.apache.log4j.Logger;
import org.oscarehr.util.LoggedInInfo;
import org.oscarehr.util.MiscUtils;
import org.oscarehr.util.SpringUtils;
import org.oscarehr.ws.common.annotation.SkipContentLoggingInbound;
import org.springframework.stereotype.Component;
import oscar.OscarProperties;
import oscar.oscarLab.ca.all.upload.handlers.LabHandlerService;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.text.ParseException;
import java.util.Date;

@WebService
@Component
@GZIP(threshold= AbstractWs.GZIP_THRESHOLD)
public class LabUploadWs extends AbstractWs {

	private static final String LAB_TYPE_AHS = "AHS"; //all Alberta labs
	private static final String LAB_TYPE_CML = "CML";
	private static final String LAB_TYPE_LIFELABS = "MDS";
	private static final String LAB_TYPE_EXCELLERIS = "PATHL7";
	private static final String LAB_TYPE_IHA = "IHA";
	private static final String LAB_TYPE_GAMMADYNACARE = "GDML";
	private static final String LAB_TYPE_CDL = "CDL";
    private static final String LAB_TYPE_EPSILON_MHL = "EPSILON";
	private static final String LAB_TYPE_ALPHA = "ALPHA";

    private static final Logger logger=MiscUtils.getLogger();

    @SkipContentLoggingInbound
    public String uploadAHS(
            @WebParam(name="file_name") String fileName,
            @WebParam(name="contents") String contents,
            @WebParam(name="oscar_provider_no") String oscarProviderNo
            )
    {
        String returnMessage, audit;

        try {
            audit = importLab(fileName, contents, LAB_TYPE_AHS, oscarProviderNo);

        } catch(Exception e)
        {
            logger.error(e.getMessage());
            returnMessage = "{\"success\":0,\"message\":\"" +
                e.getMessage() + "\", \"audit\":\"\"}";
            return returnMessage;
        }

        returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
        return returnMessage;
    }

	/**
	 * use uploadAHS instead. This method redirects to uploadAHS
	 */
    @Deprecated
    @SkipContentLoggingInbound
	public String uploadCLS(
			@WebParam(name="file_name") String fileName,
			@WebParam(name="contents") String contents,
			@WebParam(name="oscar_provider_no") String oscarProviderNo
	)
	{
    	return uploadAHS(fileName, contents, oscarProviderNo);
	}
	/**
	 * use uploadAHS instead. This method redirects to uploadAHS
	 */
	@Deprecated
    @SkipContentLoggingInbound
	public String uploadCLSDI(
			@WebParam(name="file_name") String fileName,
			@WebParam(name="contents") String contents,
			@WebParam(name="oscar_provider_no") String oscarProviderNo
	)
	{
		return uploadAHS(fileName, contents, oscarProviderNo);
	}

    @SkipContentLoggingInbound
    public String uploadCML(
            @WebParam(name="file_name") String fileName,
            @WebParam(name="contents") String contents,
            @WebParam(name="oscar_provider_no") String oscarProviderNo
            )
    {
        String returnMessage, audit;

        try {
            audit = importLab(fileName, contents, LAB_TYPE_CML, oscarProviderNo);

        } catch(Exception e)
        {
            logger.error(e.getMessage());
            returnMessage = "{\"success\":0,\"message\":\"" +
                e.getMessage() + "\", \"audit\":\"\"}";
            return returnMessage;
        }

        returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
        return returnMessage;
    }

    @SkipContentLoggingInbound
    public String uploadLifelabs(
            @WebParam(name="file_name") String fileName,
            @WebParam(name="contents") String contents,
            @WebParam(name="oscar_provider_no") String oscarProviderNo
            )
    {
        String returnMessage, audit;

        try {
        	audit = importLab(fileName, contents, LAB_TYPE_LIFELABS, oscarProviderNo);
        } catch(Exception e)
        {
            logger.error(e.getMessage());
            returnMessage = "{\"success\":0,\"message\":\"" +
                e.getMessage() + "\", \"audit\":\"\"}";
            return returnMessage;
        }

        returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
        return returnMessage;
    }

    @SkipContentLoggingInbound
    public String uploadExcelleris(
            @WebParam(name="file_name") String fileName,
            @WebParam(name="contents") String contents,
            @WebParam(name="oscar_provider_no") String oscarProviderNo
    )
    {
        String returnMessage, audit;

        try {
        	audit = importLab(fileName, contents, LAB_TYPE_EXCELLERIS, oscarProviderNo);
        } catch(Exception e)
        {
            logger.error(e.getMessage());
            returnMessage = "{\"success\":0,\"message\":\"" +
                e.getMessage() + "\", \"audit\":\"\"}";
            return returnMessage;
        }
        returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
        return returnMessage;
    }

    @SkipContentLoggingInbound
    public String uploadIHA(
            @WebParam(name="file_name") String fileName,
            @WebParam(name="contents") String contents,
            @WebParam(name="oscar_provider_no") String oscarProviderNo
            )
    {
        String returnMessage, audit;

        try {
        	audit = importLab(fileName, contents, LAB_TYPE_IHA, oscarProviderNo);
        } catch(Exception e)
        {
            logger.error(e.getMessage());
            returnMessage = "{\"success\":0,\"message\":\"" +
                e.getMessage() + "\", \"audit\":\"\"}";
            return returnMessage;
        }

        returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
        return returnMessage;
    }

    @SkipContentLoggingInbound
    public String uploadGammaDynacare(
            @WebParam(name="file_name") String fileName,
            @WebParam(name="contents") String contents,
            @WebParam(name="oscar_provider_no") String oscarProviderNo
            )
    {
        String returnMessage, audit;

        try {
            audit = importLab(fileName, contents, LAB_TYPE_GAMMADYNACARE, oscarProviderNo);
        } catch(Exception e)
        {
            logger.error(e.getMessage());
            returnMessage = "{\"success\":0,\"message\":\"" +
                e.getMessage() + "\", \"audit\":\"\"}";
            return returnMessage;
        }

        returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
        return returnMessage;
    }

    @SkipContentLoggingInbound
    public String uploadCDL(
            @WebParam(name="file_name") String fileName,
            @WebParam(name="contents") String contents,
            @WebParam(name="oscar_provider_no") String oscarProviderNo
            )
    {
        String returnMessage, audit;

        try {
            audit = importLab(fileName, contents, LAB_TYPE_CDL, oscarProviderNo);
        } catch(Exception e)
        {
            logger.error(e.getMessage());
            returnMessage = "{\"success\":0,\"message\":\"" +
                e.getMessage() + "\", \"audit\":\"\"}";
            return returnMessage;
        }

        returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
        return returnMessage;
    }

    @SkipContentLoggingInbound
	public String uploadMHL(
			@WebParam(name = "file_name") String fileName, 
			@WebParam(name = "contents") String contents,
			@WebParam(name = "oscar_provider_no") String oscarProviderNo) {
		
		String returnMessage, audit;

        try {
			audit = importLab(fileName, contents, LAB_TYPE_EPSILON_MHL, oscarProviderNo);
		}
		catch (Exception e) {
            logger.error(e.getMessage());
            returnMessage = "{\"success\":0,\"message\":\"" +
                e.getMessage() + "\", \"audit\":\"\"}";
            return returnMessage;
        }
        returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
        return returnMessage;
    }

	@SkipContentLoggingInbound
	public String uploadALPHA(
			@WebParam(name = "file_name") String fileName,
			@WebParam(name = "contents") String contents,
			@WebParam(name = "oscar_provider_no") String oscarProviderNo) {

		String returnMessage, audit;

		try {
			audit = importLab(fileName, contents, LAB_TYPE_ALPHA, oscarProviderNo);
		}
		catch (Exception e) {
			logger.error(e.getMessage());
			returnMessage = "{\"success\":0,\"message\":\"" +
					e.getMessage() + "\", \"audit\":\"\"}";
			return returnMessage;
		}
		returnMessage = "{\"success\":1,\"message\":\"\", \"audit\":\""+audit+"\"}";
		return returnMessage;
	}

    private String importLab(String fileName, String labContent, String labType, String oscarProviderNo)
		throws ParseException, Exception
    {
		HttpServletRequest request = getHttpServletRequest();

		OscarProperties props = OscarProperties.getInstance();
		String labFolderPath = props.getProperty("DOCUMENT_DIR") + "labs";
		String retVal = "";

		LoggedInInfo loggedInInfo = LoggedInInfo.getLoggedInInfoFromSession(request);
		String ipAddr = request.getRemoteAddr();

        File labFolder = new File(labFolderPath);

		if (!labFolder.exists()) {
			if (!labFolder.mkdir()) {
				throw new IOException("Failed to create lab upload folder! " + labFolderPath);
			}
		}

        // Use same naming convention as manually uploaded labs, but place in the labs folder
        fileName = "LabUpload."+fileName.replaceAll(".enc", "")+"."+(new Date()).getTime();
        String labFilePath = labFolderPath + "/" + fileName;

        // Save a copy of the lab locally. This is done to mimic the manual lab
        // upload process.
        FileUtils.writeStringToFile(new File(labFilePath), labContent);

        try
        {
            logger.debug("Lab Type: " + labType);
            logger.debug("Lab file path: " + labFilePath);
            String serviceName = getClass().getSimpleName();
            LabHandlerService labHandlerService = SpringUtils.getBean(LabHandlerService.class);
            retVal = labHandlerService.importLab(
                    labType,
                    loggedInInfo,
                    serviceName,
                    labFilePath,
                    oscarProviderNo,
                    request.getRemoteAddr()
            );

        } catch(FileAlreadyExistsException e) {
            throw new Exception("Duplicate lab file");
        } catch(Exception e) {
            throw new Exception( "Failed insert lab into DB: " + fileName + " of type: " + labType);
        }

        // This will always contain one line, so let's just remove the newline characters
        retVal = retVal.replace("\n", "").replace("\r", "");

        return retVal;
    }
}




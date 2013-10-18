package com.ford.sdlreverse.util;

import com.ford.syncV4.proxy.rpc.enums.Language;
import com.ford.syncV4.proxy.rpc.enums.SpeechCapabilities;

/**
 * Title: Const.java<br>
 * Description: Helper class to keep application constants<br>
 * 
 * @author vsaenko
 */
public class Const {
	/** Enable debug messages. For release should be false */
	public static final boolean DEBUG = true;

	public static final long MAIN_EXP_FILE_SIZE = 104159040L;
	public static final String MAIN_EXPANSION_FILE_MD5 = "a270907175c1c0a292da25d602554d95";
	public static final long PATCH_EXP_FILE_SIZE = 0L;
	public static final String PATCH_EXPANSION_FILE_MD5 = "";

	// apk expansion files
	public static final String EXP_APK_MAIN_PREFIX = "main";
	public static final String EXP_APK_PATCH_PREFIX = "patch";
	public static final int DOWNLOADER_LAUNCH_MAX_NUMBER = 2;

	public static final int ORIG_VIDEO_HEIGHT = 480;
	public static final int ORIG_VIDEO_WIDTH = 800;

	public static final int ONE_MEGABYTE = 1048576;

	public static final int VIDEO_START = 0;
	public static final int VIDEO_PLAY = 1;
	public static final int VIDEO_PAUSE = 2;
	public static final int VIDEO_SET_POSITION = 3;
	public static final int VIDEO_SET_POSITION_PAUSED = 4;
	public static final int VIDEO_STOP = 5;
	public static final int VIDEO_PLAY_AFTER_SCALE = 6;

	public static final int SPLASH_SHOW = 20;
	public static final int CONTENT_CHECKER_START = 21;
	public static final int WEBVIEW_SHOW = 22;
	public static final int MAKE_CALL = 23;

	public static final String APP_TAG = "Avatar";

	public static final String WEB_MAIN_PAGE_PATH = "file:///android_asset/index.html";

	public static final String WELCOME_VIDEO_FILE_NAME = "faq_welcome_orientation.mp4";

	public static final String MD5 = "MD5";

	public static final int KEY_PRESS_DELAY = 350;

	public static final String VIDEO_FILE_EXTENTION = ".mp4";
	public static final String MD5_FLAG_FILE_EXTENTION = ".md5";

	public static final int WEB_WIDTH = 800;
	public static final int WEB_HEIGHT = 480;

	public static final int SPLASH_TIMEOUT = 0; // ms
	
	public static final String SUPPORT_EMAIL = "mftguide@ford.com";

	//=========================================================================================
	//errors during video play 
	public static final int VC_NO_NETWORK_ERR_CODE = 10;
	public static final int VC_VIDEO_IS_BEING_DOWNLOADED_ERR_CODE = 11;
	public static final int VC_VIDEO_IS_CORRUPTED_ERR_CODE = 12;
	public static final int VC_VIDEO_IS_UNAVAILABLE_ERR_CODE = 13;
	public static final int VC_NO_SPACE_ERR_CODE = 14;
	
	//=========================================================================================
	public static final String SHPREF_FIRST_LAUNCH = "first_launch_prefs";
	public static final String SHPREF_PREVIOUS_CODE_VERSION = "previous_code_version";
	//=========================================================================================
	//rater
	public static final int RATE_SHOW_REDIRECT_WARNING_CODE = 40;
	public static final int RATE_HIDE_REDIRECT_WARNING_CODE = 41;
	public static final int RATE_NO_NETWORK_ERR_CODE = 42;
	public static final int RATE_GOOGLEPLAY_ERR_CODE = 43;
	public final static String SHPREF_APP_RATER = "app_rater_prefs";
	public final static String SHPREF_RATER_NEVER_SHOW = "never_show";
	
	//=========================================================================================
	//downloader
	public static final String SHPREF_DOWNLOADER_PREFS = "downloader_prefs";
	public static final String SHPREF_REDOWNLOAD_COUNTER = "redownload_counter";
	public static final String SHPREF_MAIN_EXPFILE_VALID = "main_expfile_valid";
	public static final String SHPREF_PATCH_EXPFILE_VALID = "patch_expfile_valid";
	
	//=========================================================================================
	//eula
	public static final int REQUESTCODE_EULA = 3000;
	
	
	
	
	// SDL 
	public static final String PREFS_NAME = "CameraToGLPreviewToMP4Prefs";

	// Protocol properties
	public static final String PREFS_KEY_PROTOCOLVERSION = "VersionNumber";
	public static final String PREFS_KEY_ISMEDIAAPP = "isMediaApp";
	public static final String PREFS_KEY_APPNAME = "appName";
	
	public static final String PREFS_KEY_APPSYNONYM1 = "appSynonym1";
	public static final String PREFS_KEY_APPSYNONYM2 = "appSynonym2";
	
	public static final String PREFS_KEY_APP_TTS_TEXT = "appTTSName";
	public static final String PREFS_KEY_APP_TTS_TYPE = "appTTSType";
	
	public static final String PREFS_KEY_APPID = "appId";
	public static final String PREFS_KEY_ESN = "esn";
	public static final String PREFS_KEY_LANG = "desiredLang";
	public static final String PREFS_KEY_HMILANG = "desiredHMILang";
	public static final String PREFS_KEY_AUTOSETAPPICON = "autoSetAppIcon";
	public static final String PREFS_KEY_DISABLE_LOCK_WHEN_TESTING = "disableLockWhenTesting";

	// Default values
	public static final int PREFS_DEFAULT_PROTOCOLVERSION = 2;
	public static final boolean PREFS_DEFAULT_ISMEDIAAPP = true;
	public static final String PREFS_DEFAULT_APPNAME = "CameraToGLPreviewToMP4";
	public static final String PREFS_DEFAULT_APPSYNONYM1 = "Synonym1";
	public static final String PREFS_DEFAULT_APPSYNONYM2 = "Synonym2";
	
	public static final String PREFS_DEFAULT_APP_TTS_TEXT = "Camera To GL Preview To MP4";
	public static final String PREFS_DEFAULT_APP_TTS_TYPE = SpeechCapabilities.TEXT.name();
	
	public static final String PREFS_DEFAULT_APPID = "2037240362";  //"1766825573";
	public static final String PREFS_DEFAULT_ESN = "CP7E0297";
	public static final String PREFS_DEFAULT_LANG = Language.EN_US.name();
	public static final String PREFS_DEFAULT_HMILANG = Language.EN_US.name();
	public static final boolean PREFS_DEFAULT_AUTOSETAPPICON = true;
	public static final boolean PREFS_DEFAULT_DISABLE_LOCK_WHEN_TESTING = false;

	// Transport properties
	public static final class Transport {
		// Protocol properties
		public static final String PREFS_KEY_TRANSPORT_TYPE = "TransportType";
		public static final String PREFS_KEY_TRANSPORT_PORT = "TCPPort";
		public static final String PREFS_KEY_TRANSPORT_IP = "IPAddress";
		public static final String PREFS_KEY_TRANSPORT_RECONNECT = "AutoReconnect";

		public static final String TCP = "WiFi";
		public static final String BLUETOOTH = "Bluetooth";
		public static final String USB = "USB";
		public static final int KEY_TCP = 1;
		public static final int KEY_BLUETOOTH = 2;
		public static final int KEY_USB = 3;

		//public static final int PREFS_DEFAULT_TRANSPORT_TYPE = KEY_TCP;
		public static final int PREFS_DEFAULT_TRANSPORT_TYPE = KEY_TCP;
		public static final int PREFS_DEFAULT_TRANSPORT_PORT = 12345;
		public static final String PREFS_DEFAULT_TRANSPORT_IP = "10.0.2.2";
		public static final boolean PREFS_DEFAULT_TRANSPORT_RECONNECT_DEFAULT = true;
	}
		
}

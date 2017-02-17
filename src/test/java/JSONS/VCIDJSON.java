package JSONS;

public class VCIDJSON {

	public static String getVCID(String imei, String osId, String psId, String msisdn, String categoryCode) {
		String requestJSON = "{\"operationCode\": \"VCID\", \"oAuth\": { \"interfaceId\": \"ZotoUsers\"},\"interfaceData\": {\"version\": \"2.3.8\",\"type\": \"MOB\",\"identification\": \""
				+ imei + "\",\"osId\": \"" + osId + "\",\"psId\": \"" + psId
				+ "\",\"data\": {\"manufacture\": \"SAMSUNG\",\"manufactureModel\": \"4s\",\"os\": \"android\",\"osVersion\": \"4.1.1\",\"area\": \"LAGOS\"},\"installedApps\": [\"Best Whatsapp Status\",\"Naukri.com\",\"Truecaller\",\"EPFO\",\"All WhatsApp Status\",\"Docs\",\"8 Ball Pool\",\"My Airtel\",\"WhatsApp\",\"GIF Keyboard\",\"Amazon Shopping\",\"Zoto\",\"FunOn\",\"Wps Wpa Tester\",\"Speedtest\",\"Jugnoo\",\"Flipkart\",\"NTES\",\"Hindi Jokes\",\"IMEI Changer\",\"ixigo trains\",\"OlaCabs\",\"Best Status\",\"SHAREit\",\"MSG91\",\"iMobile\",\"Paytm\",\"Street View\",\"Flashlight\",\"MobiKwik\",\"VideoStream\",\"Facebook\",\"bookmyshow\",\"Messenger\",\"Activity Lifecycle\",\"Slack\",\"Latest Whatsapp Status\",\"Best WhatsApp Status\",\"Myntra\",\"Tec.Rac\",\"Tinder\",\"Goibibo\",\"Subway Surf\",\"Order\",\"FreeCharge\",\"DataBack\",\"chotibate\"]},\"user\": {\"msisdn\": \""
				+ msisdn + "\",\"type\": \"SMS\",\"categoryCode\": \"" + categoryCode + "\"}}";

		return requestJSON;
	}

}

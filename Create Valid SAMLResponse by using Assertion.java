package saml;
import java.util.Base64;

public class response {
	public static void main(String[] args) {
		String id = "s2b47209af9e4281f1cfe16fc5745260a6f9062fd1";
		String ssoACS = "https://cabiqa.creditacceptance.com/saml2/sp/acs/post";
		String IDPIssuer = "openam";
		
		String api = "<saml:Assertion xmlns:saml=\\\"urn:oasis:names:tc:SAML:2.0:assertion\\\" ID=\\\"s2d512593610e9c5a679fb86266e7830d961433519\\\" IssueInstant=\\\"2019-04-30T18:36:16Z\\\" Version=\\\"2.0\\\">\\n<saml:Issuer>openam</saml:Issuer><ds:Signature xmlns:ds=\\\"http://www.w3.org/2000/09/xmldsig#\\\">\\n<ds:SignedInfo>\\n<ds:CanonicalizationMethod Algorithm=\\\"http://www.w3.org/2001/10/xml-exc-c14n#\\\"/>\\n<ds:SignatureMethod Algorithm=\\\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha512\\\"/>\\n<ds:Reference URI=\\\"#s2d512593610e9c5a679fb86266e7830d961433519\\\">\\n<ds:Transforms>\\n<ds:Transform Algorithm=\\\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\\\"/>\\n<ds:Transform Algorithm=\\\"http://www.w3.org/2001/10/xml-exc-c14n#\\\"/>\\n</ds:Transforms>\\n<ds:DigestMethod Algorithm=\\\"http://www.w3.org/2001/04/xmlenc#sha512\\\"/>\\n<ds:DigestValue>4quzXtkLSwsl1FrCWEBVWJlzJRJQIdDggAG8eaXFPswtTl2Vx2sIaTznzNx7JiNAw61VbnPd2tUT\\nJzHu9BQ08w==</ds:DigestValue>\\n</ds:Reference>\\n</ds:SignedInfo>\\n<ds:SignatureValue>\\nac7rbMTZ/4EfTYlQb7fwesAi2EQSfmQwZjUGlcjJdiL58YUffb5bT89rzPembAt5NE9MBvFAG8d0\\nsvcQQr2WR6NZ4ZdcJMFeYF40LSZS7+qlrZKx4Gcn5mNGsjRK6BGDanavrigAgGS98RmSYid1YK+M\\nDLs3bTq8Cih0LZCEemI=\\n</ds:SignatureValue>\\n<ds:KeyInfo>\\n<ds:X509Data>\\n<ds:X509Certificate>\\nMIICSjCCAbOgAwIBAgIEbt/YvzANBgkqhkiG9w0BAQsFADBYMQswCQYDVQQGEwJVUzELMAkGA1UE\\nCBMCTUkxEzARBgNVBAcTClNvdXRoZmllbGQxCzAJBgNVBAoTAkZSMQwwCgYDVQQLEwNDQUMxDDAK\\nBgNVBAMTA1hpbjAeFw0xODAxMTUxNjEwMDVaFw0yMDAxMTUxNjEwMDVaMFgxCzAJBgNVBAYTAlVT\\nMQswCQYDVQQIEwJNSTETMBEGA1UEBxMKU291dGhmaWVsZDELMAkGA1UEChMCRlIxDDAKBgNVBAsT\\nA0NBQzEMMAoGA1UEAxMDWGluMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCYxD9iYWrLYaEO\\nWr8NJMRDaL4/YqsWSuonJ0rkJkxpicpjEM6ui3L01NXi3WrmdITpNOrCB1aYE0pT9U1jkO1bKIsg\\nKyBi3HPcF/lUCvxrzEWGyW/vpUF6QS5KKJYxoMAja6dCkirEct8X9DLKu5q8Q9Q4TUDPWSAEG4zh\\n8IJ+owIDAQABoyEwHzAdBgNVHQ4EFgQUwLhIL0HDjGt4w5W+3ZE1RIXIggMwDQYJKoZIhvcNAQEL\\nBQADgYEAd6/QkKLq91N5qMUy7sMZHb1NR8LM3rE3diB2p54YpdoLbPe8kpDvDbz47kf4oua1KsVI\\nBfnhb4/YPCpOVOPPzBqg2WzMhvfiWsqTqhhrPJghjK8tINbVUD+wVNwCWfftQliqucwnw6vlBCQZ\\nbbEdBQNEDFDvvWd9ougyO84hQyU=\\n</ds:X509Certificate>\\n</ds:X509Data>\\n</ds:KeyInfo>\\n</ds:Signature><saml:Subject>\\n<saml:NameID Format=\\\"urn:oasis:names:tc:SAML:1.0:nameid-format:unspecified\\\">xlian</saml:NameID><saml:SubjectConfirmation Method=\\\"urn:oasis:names:tc:SAML:2.0:cm:bearer\\\">\\n<saml:SubjectConfirmationData NotOnOrAfter=\\\"2019-04-30T18:46:16Z\\\" Recipient=\\\"https://cabiqa.creditacceptance.com/saml2/sp/acs/post\\\"/></saml:SubjectConfirmation>\\n</saml:Subject><saml:Conditions NotBefore=\\\"2019-04-30T18:36:16Z\\\" NotOnOrAfter=\\\"2019-04-30T18:46:16Z\\\">\\n<saml:AudienceRestriction>\\n<saml:Audience>cabi</saml:Audience>\\n</saml:AudienceRestriction>\\n</saml:Conditions>\\n<saml:AuthnStatement AuthnInstant=\\\"2019-04-30T18:36:16Z\\\"><saml:AuthnContext><saml:AuthnContextClassRef>urn:oasis:names:tc:SAML:2.0:ac:classes:PreviousSession</saml:AuthnContextClassRef></saml:AuthnContext></saml:AuthnStatement><saml:AttributeStatement><saml:Attribute Name=\\\"AuthSource\\\"><saml:AttributeValue xmlns:xs=\\\"http://www.w3.org/2001/XMLSchema\\\" xmlns:xsi=\\\"http://www.w3.org/2001/XMLSchema-instance\\\" xsi:type=\\\"xs:string\\\">2</saml:AttributeValue></saml:Attribute><saml:Attribute Name=\\\"uid\\\"><saml:AttributeValue xmlns:xs=\\\"http://www.w3.org/2001/XMLSchema\\\" xmlns:xsi=\\\"http://www.w3.org/2001/XMLSchema-instance\\\" xsi:type=\\\"xs:string\\\">xlian</saml:AttributeValue></saml:Attribute></saml:AttributeStatement></saml:Assertion>";
		 api = api.replace("\\n","\n");
		String assertion = api.replace("\\","");
		
		String substr = "IssueInstant=\"";
		String[] parts = assertion.split(substr);
		String Issuetime = parts[1].substring(0,20);
		//System.out.println(assertion);
		
		
		String response2 ="<samlp:Response xmlns:samlp=\"urn:oasis:names:tc:SAML:2.0:protocol\" ID=\""+ id + "\" " + "Version=\"2.0\" IssueInstant=\"" + 
		Issuetime + "\" " + "Destination=\"" + ssoACS + "\"><saml:Issuer xmlns:saml=\"urn:oasis:names:tc:SAML:2.0:assertion\">"+ IDPIssuer +"</saml:Issuer><samlp:Status xmlns:samlp=\"urn:oasis:names:tc:SAML:2.0:protocol\">\r\n" + 
				"<samlp:StatusCode xmlns:samlp=\"urn:oasis:names:tc:SAML:2.0:protocol\" Value=\"urn:oasis:names:tc:SAML:2.0:status:Success\">\r\n" + 
				"</samlp:StatusCode>\r\n" + 
				"</samlp:Status>"+ assertion +"</samlp:Response>";
		
		//System.out.print(response2);
		byte[] encodedBytes = Base64.getEncoder().encode(response2.getBytes());
		String encodedResponse = new String(encodedBytes);
		
		
		System.out.println(encodedResponse);
		
	}		
}
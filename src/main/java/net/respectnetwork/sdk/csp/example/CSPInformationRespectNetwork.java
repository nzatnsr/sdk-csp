package net.respectnetwork.sdk.csp.example;

import net.respectnetwork.sdk.csp.BasicCSPInformation;
import xdi2.core.xri3.CloudNumber;
import xdi2.core.xri3.XDI3Segment;

public class CSPInformationRespectNetwork extends BasicCSPInformation {

	private static final long serialVersionUID = -1186435920408698291L;

	public CSPInformationRespectNetwork() {

		super(
				CloudNumber.create("[@]!:uuid:ca51aeb9-e09e-4305-89d7-87a944a1e1fa"),
				"s3cr3t",
				"http://mycloud-ote.neustar.biz:14440/registry",
				"http://mycloud-ote.neustar.biz:14440/users/",
				CloudNumber.create("[@]!:uuid:ca51aeb9-e09e-4305-89d7-87a944a1e1fa"),
				"https://registration-dev.respectnetwork.net/registration",
				XDI3Segment.create("[@]!:uuid:ca51aeb9-e09e-4305-89d7-87a944a1e1fa$to+registrar$from$do")
				);
	}
}
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib prefix="bbNG" uri="/bbNG"%>
<%@taglib uri="/bbData" prefix="bbData"%>
<%@taglib uri="/bbUI" prefix="bbUI"%>

<bbNG:genericPage>
	<bbNG:pageHeader instructions="Test Page">
		<bbNG:breadcrumbBar environment="SYS_ADMIN">
			<bbNG:breadcrumb>Quartz Example</bbNG:breadcrumb>
		</bbNG:breadcrumbBar>
		<bbNG:pageTitleBar>Quartz Example</bbNG:pageTitleBar>
	</bbNG:pageHeader>
<h1>
	Test Page
</h1>

	The value written was: <h3>${showName}</h3>

</bbNG:genericPage>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@taglib prefix="bbNG" uri="/bbNG"%>
<%@taglib uri="/bbData" prefix="bbData"%>
<%@taglib uri="/bbUI" prefix="bbUI"%>

<bbNG:genericPage>
	<bbNG:pageHeader instructions="Test Page">
		<bbNG:breadcrumbBar environment="SYS_ADMIN" >
			<bbNG:breadcrumb>Quartz Example</bbNG:breadcrumb>
		</bbNG:breadcrumbBar>
		<bbNG:pageTitleBar>Quartz Example</bbNG:pageTitleBar>
	</bbNG:pageHeader>
	<bbNG:form action="result" method="post">
	
		<bbNG:dataCollection>
	
			<bbNG:step title="Config page" instructions="Sending test">
			
				<bbNG:dataElement label="Test field">
				
					<bbNG:textElement name="testeName"/>
				
				</bbNG:dataElement>
				
				<bbNG:stepSubmit title="Submit"></bbNG:stepSubmit>
			
			</bbNG:step>
		
		</bbNG:dataCollection>
	
	</bbNG:form>
	
</bbNG:genericPage>
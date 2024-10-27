/**
 * 
 */
/**
 * 
 */
module ClientBook {
	requires com.fasterxml.jackson.databind;
	requires org.apache.httpcomponents.httpclient;
	requires org.apache.httpcomponents.httpcore;
	opens bookclient to com.fasterxml.jackson.databind;
}
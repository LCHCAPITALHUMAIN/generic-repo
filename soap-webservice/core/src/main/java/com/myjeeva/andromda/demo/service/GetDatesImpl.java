// license-header java merge-point
/* Autogenerated on 07/23/2012 17:27:04+0530 by AndroMDA!
 *
 * TEMPLATE:    jaxws\WebServiceMethodImpl.vsl in andromda-webservices-cartridge
 * MODEL CLASS: AndroMDAModel::com.myjeeva.andromda.demo::service::SampleWebService::getDates
 * STEREOTYPE:  WebService on SampleWebService
*/
package com.myjeeva.andromda.demo.service;

import com.myjeeva.andromda.demo.vo.DatesVO;
import java.util.Date;

/**
 * WebService Service Method Implementation for the SampleWebService
 * service org.andromda.cartridges.webservice.metafacades.WebServiceOperationLogicImpl[com.myjeeva.andromda.demo.service.SampleWebService.getDates].
 * 
 */

public class GetDatesImpl
{
    /**
     * Constructor
     */
    public GetDatesImpl()
    {
        //Documented empty code block - avoid compiler warning
    }

    /**
     * Delegate for TestCase SampleWebServiceWSDelegateTest and SampleWebServiceSEIImplTest
     */
    public static void getDatesSetUp()
    {
        // Insert your custom code here for additional required unit test case setup for service method
    }

    /**
     * Delegate for TestCase SampleWebServiceWSDelegateTest and SampleWebServiceSEIImplTest
     */
    public static void getDatesTearDown()
    {
        // Insert your custom code here for additional required unit test case tear down for service method
    }

   /**
    * Transforms the getDates service method parameters on SampleWebService.
    * 
    * @param start datatype.DateTime multiplicity=1..1
    * @param end datatype.DateTime multiplicity=1..1
    * Replace void with transformed type, use target.set() values to create transformation
    */
    public static void getDatesTransformInput(
        final Date start
        , final Date end
    )
    {

        if (start != null)
        {
            // transform(Date);
        }

        if (end != null)
        {
            // transform(Date);
        }
    }

   /**
    * Transforms input to an output response for getDates service method on SampleWebService.
    * 
    * @return getDatesResponse DatesVO
    */
    public static DatesVO getDatesTransformResponse(
        /* Domain response to be transformed to service response */)
        // throws TransformationException?
    {
        // Dummy return value implementation with default values...
        // Iterate down through all complex types and create default dummy constructor and attribute values
        DatesVO rtn = new DatesVO();
        rtn.setStart(new Date());
        rtn.setEnd(new Date());

        return rtn;
    }

    /** Create input test data for SampleWebService getDates
     * Used by webservice WSClient (against service) and core service WSDelegateTest (against implementation).
     * Return wrapped parameters:
     * start: Date
     * end: Date
     * @return getDatesReturn GetDates WS Input parameter wrapper (assumes wrapped WSDL)
     **/
    public static GetDates getDatesCreateInput()
    {
        GetDates getDatesReturn = new GetDates();

        // parameter1 startParam1 with 0 properties:
        Date startParam1 = new Date();
        getDatesReturn.setStart(startParam1);

        // parameter2 endParam2 with 0 properties:
        Date endParam2 = new Date();
        getDatesReturn.setEnd(endParam2);

        return getDatesReturn;
    }
}
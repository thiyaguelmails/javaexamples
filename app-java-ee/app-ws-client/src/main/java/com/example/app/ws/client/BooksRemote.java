
package com.example.app.ws.client;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BooksRemote", targetNamespace = "http://remote.session.ejb.example.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BooksRemote {


    /**
     * 
     * @param saveBookRequest
     * @return
     *     returns javax.xml.ws.Response<com.example.app.ws.client.Book>
     */
    @WebMethod(operationName = "save")
    public Response<Book> saveAsync(
        @WebParam(name = "save", targetNamespace = "http://remote.session.ejb.example.com/", partName = "saveBookRequest")
        Book saveBookRequest);

    /**
     * 
     * @param asyncHandler
     * @param saveBookRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "save")
    public Future<?> saveAsync(
        @WebParam(name = "save", targetNamespace = "http://remote.session.ejb.example.com/", partName = "saveBookRequest")
        Book saveBookRequest,
        @WebParam(name = "saveResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<Book> asyncHandler);

    /**
     * 
     * @param saveBookRequest
     * @return
     *     returns com.example.app.ws.client.Book
     * @throws BusinessException_Exception
     */
    @WebMethod
    @WebResult(name = "saveResponse", targetNamespace = "http://remote.session.ejb.example.com/", partName = "saveBookResponse")
    public Book save(
        @WebParam(name = "save", targetNamespace = "http://remote.session.ejb.example.com/", partName = "saveBookRequest")
        Book saveBookRequest)
        throws BusinessException_Exception
    ;

    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<com.example.app.ws.client.BookArray>
     */
    @WebMethod(operationName = "findAll")
    public Response<BookArray> findAllAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "findAll")
    public Future<?> findAllAsync(
        @WebParam(name = "findAllResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<BookArray> asyncHandler);

    /**
     * 
     * @return
     *     returns com.example.app.ws.client.BookArray
     */
    @WebMethod
    @WebResult(name = "books", targetNamespace = "http://remote.session.ejb.example.com/", partName = "books")
    public BookArray findAll();

    /**
     * 
     * @param getCover
     * @return
     *     returns javax.xml.ws.Response<byte[]>
     */
    @WebMethod(operationName = "getCover")
    public Response<byte[]> getCoverAsync(
        @WebParam(name = "getCover", targetNamespace = "http://remote.session.ejb.example.com/", partName = "getCover")
        long getCover);

    /**
     * 
     * @param getCover
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getCover")
    public Future<?> getCoverAsync(
        @WebParam(name = "getCover", targetNamespace = "http://remote.session.ejb.example.com/", partName = "getCover")
        long getCover,
        @WebParam(name = "getCoverResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<byte[]> asyncHandler);

    /**
     * 
     * @param getCover
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(name = "getCoverResponse", targetNamespace = "http://remote.session.ejb.example.com/", partName = "getCoverResponse")
    public byte[] getCover(
        @WebParam(name = "getCover", targetNamespace = "http://remote.session.ejb.example.com/", partName = "getCover")
        long getCover);

    /**
     * 
     * @param findById
     * @return
     *     returns javax.xml.ws.Response<com.example.app.ws.client.Book>
     */
    @WebMethod(operationName = "findById")
    public Response<Book> findByIdAsync(
        @WebParam(name = "findById", targetNamespace = "http://remote.session.ejb.example.com/", partName = "findById")
        long findById);

    /**
     * 
     * @param findById
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "findById")
    public Future<?> findByIdAsync(
        @WebParam(name = "findById", targetNamespace = "http://remote.session.ejb.example.com/", partName = "findById")
        long findById,
        @WebParam(name = "findByIdResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<Book> asyncHandler);

    /**
     * 
     * @param findById
     * @return
     *     returns com.example.app.ws.client.Book
     */
    @WebMethod
    @WebResult(name = "book", targetNamespace = "http://remote.session.ejb.example.com/", partName = "book")
    public Book findById(
        @WebParam(name = "findById", targetNamespace = "http://remote.session.ejb.example.com/", partName = "findById")
        long findById);

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.example.app.ws.client.SaveCoverResponse>
     */
    @WebMethod(operationName = "saveCover")
    public Response<SaveCoverResponse> saveCoverAsync(
        @WebParam(name = "saveCover", targetNamespace = "http://remote.session.ejb.example.com/", partName = "parameters")
        SaveCover parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "saveCover")
    public Future<?> saveCoverAsync(
        @WebParam(name = "saveCover", targetNamespace = "http://remote.session.ejb.example.com/", partName = "parameters")
        SaveCover parameters,
        @WebParam(name = "saveCoverResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<SaveCoverResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.example.app.ws.client.SaveCoverResponse
     */
    @WebMethod
    @WebResult(name = "saveCoverResponse", targetNamespace = "http://remote.session.ejb.example.com/", partName = "parameters")
    public SaveCoverResponse saveCover(
        @WebParam(name = "saveCover", targetNamespace = "http://remote.session.ejb.example.com/", partName = "parameters")
        SaveCover parameters);

}

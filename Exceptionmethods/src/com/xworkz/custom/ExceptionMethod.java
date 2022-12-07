package com.xworkz.custom;

import java.awt.AWTError;
import java.awt.color.CMMException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.image.ImagingOpException;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.UnsupportedAddressTypeException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.charset.MalformedInputException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.rmi.NotBoundException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.prefs.BackingStoreException;
import java.util.zip.DataFormatException;

import javax.activity.InvalidActivityException;
import javax.lang.model.UnknownEntityException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.JMRuntimeException;
import javax.naming.CannotProceedException;
import javax.naming.NamingException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.RefreshFailedException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.RemarshalException;

import com.sun.media.sound.InvalidDataException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;

import netscape.javascript.JSException;

public class ExceptionMethod {
    public void method1() {
	System.out.println("running cricket");
	throw new RuntimeException();
    }
	public void method2() throws ImagingOpException
	{
		System.out.println("running method running");
		throw new ImagingOpException(null);
	
	}
 public void method3()throws ArithmeticException {
	 System.out.println("running printStack");
	 throw new ArithmeticException();
 }
 public void method4()throws AnnotationTypeMismatchException {
	 System.out.println("running printStack");
	 throw new ArithmeticException();
 }
 public void method5()throws ArrayStoreException {
	 System.out.println("running printStack");
	 throw new ArrayStoreException();
 }
 public void method6()throws BufferOverflowException {
	 System.out.println("running printStack");
	 throw new BufferOverflowException();
 }
 public void method7()throws BufferUnderflowException {
	 System.out.println("running BufferUnderflowException");
	 throw new BufferUnderflowException();
 }
 public void method8()throws MalformedInputException {
	 System.out.println("running MalformedInputException");
	 throw new MalformedInputException(0);
 }
 public void method9()throws NoSuchAlgorithmException {
	 System.out.println("running NoSuchAlgorithmException");
	 throw new NoSuchAlgorithmException();
 }
 public void method10()throws ArithmeticException {
	 System.out.println("running printStack");
	 throw new ArithmeticException();
 }
 public void method11()throws DataFormatException {
	 System.out.println("running DataFormatException");
	 throw new DataFormatException();
 }
 public void method12()throws MissingResourceException {
	 System.out.println("running MissingResourceException");
	 throw new MissingResourceException(null, null, null);
 }
 public void method13()throws AnnotationFormatError{
	 System.out.println("running AnnotationFormatError");
	 throw new AnnotationFormatError(null, null);
 }
 public void method14()throws AnnotationTypeMismatchException{
	 System.out.println("running AnnotationTypeMismatchException");
	 throw new AnnotationTypeMismatchException(null, null);
 }
 public void method15()throws ImagingOpException{
	 System.out.println("running ImagingOpException");
	 throw new ImagingOpException(null);
 }
 public void method16()throws FileSystemAlreadyExistsException{
	 System.out.println("running FileSystemAlreadyExistsException");
	 throw new FileSystemAlreadyExistsException(null);
 }	
 public void method17()throws FileSystemAlreadyExistsException, FileAlreadyExistsException{
	 System.out.println("running FileSystemAlreadyExistsException");
	 throw new FileAlreadyExistsException(null);
 }	
 public void method18()throws WrongMethodTypeException{
	 System.out.println("running WrongMethodTypeException");
	 throw new WrongMethodTypeException(null);
 }
 public void method19()throws EmptyStackException{
	 System.out.println("running EmptyStackException");
	 throw new EmptyStackException();
 }
 public void method20()throws CMMException{
	 System.out.println("running CMMException");
	 throw new CMMException(null);
 }
 public void method21()throws UnsupportedAddressTypeException{
	 System.out.println("running UnsupportedAddressTypeException");
	 throw new UnsupportedAddressTypeException();
 }
 public void method22()throws NoSuchAlgorithmException{
	 System.out.println("running NoSuchAlgorithmException");
	 throw new NoSuchAlgorithmException();
	 
 }
 public void method23()throws ConcurrentModificationException{
	 System.out.println("running ConcurrentModificationException");
	 throw new ConcurrentModificationException();
	 
 }
 public void method24()throws MissingResourceException{
	 System.out.println("running MissingResourceException");
	 throw new MissingResourceException(null, null, null);
 }
 public void method25()throws CannotProceedException{
	 System.out.println("running CannotProcedeException");
	 throw new CannotProceedException();
 }
 public void method26()throws BadBinaryOpValueExpException{
	 System.out.println("running BadBinaryOpValueExpException");
	 throw new BadBinaryOpValueExpException(null);
 }
 
 public void method27()throws XMLSignatureException{
	 System.out.println("running XMLSignatureException");
	 throw new XMLSignatureException();
 }
 public void method28()throws BackingStoreException{
	 System.out.println("running BackingStoreException");
	 throw new BackingStoreException("hvhg");
 }

 public void method29()throws TransformerException,{
	 System.out.println("running TransformerException,");
	 throw new TransformerException("vhsgu");
 }
 public void method30()throws AclNotFoundException{
	 System.out.println("running AclNotFoundException");
	 throw new AclNotFoundException();
 }
 public void method31()throws GSSException{
	 System.out.println("running , GSSException");
	 throw new GSSException(0);
 }
 public void method32()throws WrongMethodTypeException{
	 System.out.println("running WrongMethodTypeException");
	 throw new WrongMethodTypeException(null);
 }
 public void method33()throws NotOwnerException{
	 System.out.println("running NotOwnerException");
	 throw new NotOwnerException();
 }
 public void method34()throws NamingException{
	 System.out.println("running NamingException");
	 throw new NamingException(null);
 }
 public void method35()throws RemarshalException{
	 System.out.println("running RemarshalException");
	 throw new RemarshalException();
 }
 
 public void method36() {
	 System.out.println("AssertionError");
	 throw new AssertionError();
 }
 public void method37() {
	 System.out.println("AWTError,");
	 throw new AWTError(null);
 }
 public void method38() {
	 System.out.println("AnnotationFormatError,");
	 throw new AnnotationFormatError("wehe");
 }
 public void method39() {
	 System.out.println("ServiceConfigurationError,");
	 throw new ServiceConfigurationError("nbdjd");
 }
 public void method40() {
	 System.out.println("LinkageError,");
	 throw new LinkageError(null);
 }
 public void method41() {
	 System.out.println("CoderMalfunctionError,");
	 throw new CoderMalfunctionError(null);
 }
 public void method42() {
	 System.out.println("MimeTypeParseException,,");
	 throw new MimeTypeParseException(null);
 }
 public void method43() {
	 System.out.println("RefreshFailedException,");
	 throw new RefreshFailedException(null);
 }
 public void method44() {
	 System.out.println("SOAPException,");
	 throw new SOAPException();
 }
 public void method45() {
	 System.out.println("NotBoundException,");
	 throw new NotBoundException(null);
 }
 public void method46() {
	 System.out.println("FactoryConfigurationError,");
	 throw new FactoryConfigurationError();
 }
 public void method47() {
	 System.out.println("TransformerFactoryConfigurationError,");
	 throw new TransformerFactoryConfigurationError();
 }
 public void method48() {
	 System.out.println("IOError,");
	 throw new IOError(null);
 }
 public void method49() {
	 System.out.println("TransformerFactoryConfigurationError,");
	 throw new TransformerFactoryConfigurationError();
 }
 public void method50() {
	 System.out.println("TransformerFactoryConfigurationError,");
	 throw new TransformerFactoryConfigurationError();
 }
 public void method52() {
	 System.out.println("ImagingOpException,");
	 throw new ImagingOpException("bdhwguuh");
 }
 public void method53() {
	 System.out.println("NegativeArraySizeException,");
	 throw new NegativeArraySizeException("bdhwguuh");
 }
 public void method54() {
	 System.out.println("JSException,");
	 throw new JSException("bdhwguuh");
 }
 public void method55() {
	 System.out.println(" JMRuntimeException,");
	 throw new  JMRuntimeException("bdhwguuh");
 }
 public void method56() {
	 System.out.println("UndeclaredThrowableException,");
	 throw new UndeclaredThrowableException(null, "bdhwguuh");
 }
 public void method57() {
	 System.out.println(" UnmodifiableModuleException,,");
	 throw new  UnmodifiableSetException();
	 
 }
 public void method58() {
	 System.out.println(" InvalidAlgorithmParameterException,,");
	 throw new  InvalidAlgorithmParameterException();
	 
 }
 public void method59() {
	 System.out.println(" InvalidActivityException,,");
	 throw new  InvalidActivityException();
	 
 }
 public void method60() {
	 System.out.println(" InvalidDataException,,,");
	 throw new  InvalidDataException();
	 
 }
 public void metho61() {
	 System.out.println(" UnsupportedAddressTypeException,,");
	 throw new  UnsupportedAddressTypeException();
	 
 }
}
    



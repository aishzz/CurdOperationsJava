package com.xworkz.custom;

import java.awt.AWTError;
import java.awt.color.CMMException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.image.ImagingOpException;
import java.awt.print.PrinterException;
import java.io.IOError;
import java.io.IOException;
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
import java.nio.file.FileSystemNotFoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
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
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.naming.CannotProceedException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.RefreshFailedException;
import javax.sound.sampled.LineUnavailableException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.RemarshalException;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;
import com.sun.javafx.geom.IllegalPathStateException;
import com.sun.media.sound.InvalidDataException;
import com.sun.org.apache.xerces.internal.impl.xpath.XPathException;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureException;
import com.sun.xml.internal.ws.policy.privateutil.ServiceConfigurationError;

import netscape.javascript.JSException;

public class ExceptionMethod {
    public static void method1() {
	System.out.println("running cricket");
	throw new RuntimeException();
    }
	public static void method2() throws ImagingOpException
	{
		System.out.println("running method running");
		throw new ImagingOpException(null);
	
	}
 public static void method3()throws ArithmeticException {
	 System.out.println("running printStack");
	 throw new ArithmeticException();
 }
 public static void method4()throws AnnotationTypeMismatchException {
	 System.out.println("running printStack");
	 throw new ArithmeticException();
 }
 public static void method5()throws ArrayStoreException {
	 System.out.println("running printStack");
	 throw new ArrayStoreException();
 }
 public static void method6()throws BufferOverflowException {
	 System.out.println("running printStack");
	 throw new BufferOverflowException();
 }
 public  static void method7()throws BufferUnderflowException {
	 System.out.println("running BufferUnderflowException");
	 throw new BufferUnderflowException();
 }
 public static void method8()throws MalformedInputException {
	 System.out.println("running MalformedInputException");
	 throw new MalformedInputException(0);
 }
 public static void method9()throws NoSuchAlgorithmException {
	 System.out.println("running NoSuchAlgorithmException");
	 throw new NoSuchAlgorithmException();
 }
 public static void method10()throws ArithmeticException {
	 System.out.println("running printStack");
	 throw new ArithmeticException();
 }
 public static void method11()throws DataFormatException {
	 System.out.println("running DataFormatException");
	 throw new DataFormatException();
 }
 public static void method12()throws MissingResourceException {
	 System.out.println("running MissingResourceException");
	 throw new MissingResourceException(null, null, null);
 }
 public static void method13()throws AnnotationFormatError{
	 System.out.println("running AnnotationFormatError");
	 throw new AnnotationFormatError(null, null);
 }
 public static void method14()throws AnnotationTypeMismatchException{
	 System.out.println("running AnnotationTypeMismatchException");
	 throw new AnnotationTypeMismatchException(null, null);
 }
 public static void method15()throws ImagingOpException{
	 System.out.println("running ImagingOpException");
	 throw new ImagingOpException(null);
 }
 public static void method16()throws FileSystemAlreadyExistsException{
	 System.out.println("running FileSystemAlreadyExistsException");
	 throw new FileSystemAlreadyExistsException(null);
 }	
 public static void method17()throws FileSystemAlreadyExistsException, FileAlreadyExistsException{
	 System.out.println("running FileSystemAlreadyExistsException");
	 throw new FileAlreadyExistsException(null);
 }	
 public static void method18()throws WrongMethodTypeException{
	 System.out.println("running WrongMethodTypeException");
	 throw new WrongMethodTypeException(null);
 }
 public static void method19()throws EmptyStackException{
	 System.out.println("running EmptyStackException");
	 throw new EmptyStackException();
 }
 public static void method20()throws CMMException{
	 System.out.println("running CMMException");
	 throw new CMMException(null);
 }
 public static void method21()throws UnsupportedAddressTypeException{
	 System.out.println("running UnsupportedAddressTypeException");
	 throw new UnsupportedAddressTypeException();
 }
 public static void method22()throws NoSuchAlgorithmException{
	 System.out.println("running NoSuchAlgorithmException");
	 throw new NoSuchAlgorithmException();
	 
 }
 public static void method23()throws ConcurrentModificationException{
	 System.out.println("running ConcurrentModificationException");
	 throw new ConcurrentModificationException();
	 
 }
 public static void method24()throws MissingResourceException{
	 System.out.println("running MissingResourceException");
	 throw new MissingResourceException(null, null, null);
 }
 public static void method25()throws CannotProceedException{
	 System.out.println("running CannotProcedeException");
	 throw new CannotProceedException();
 }
 public static void method26()throws BadBinaryOpValueExpException{
	 System.out.println("running BadBinaryOpValueExpException");
	 throw new BadBinaryOpValueExpException(null);
 }
 
 public static void method27()throws XMLSignatureException{
	 System.out.println("running XMLSignatureException");
	 throw new XMLSignatureException();
 }
 public  static void method28()throws BackingStoreException{
	 System.out.println("running BackingStoreException");
	 throw new BackingStoreException("hvhg");
 }

 public static void method29()throws TransformerException{
	 System.out.println("running TransformerException,");
	 throw new TransformerException("vhsgu");
 }
 public static void method30()throws AclNotFoundException{
	 System.out.println("running AclNotFoundException");
	 throw new AclNotFoundException();
 }
 public static void method31()throws GSSException{
	 System.out.println("running , GSSException");
	 throw new GSSException(0);
 }
 public static void method32()throws WrongMethodTypeException{
	 System.out.println("running WrongMethodTypeException");
	 throw new WrongMethodTypeException(null);
 }
 public static void method33()throws NotOwnerException{
	 System.out.println("running NotOwnerException");
	 throw new NotOwnerException();
 }
 public static void method34()throws NamingException{
	 System.out.println("running NamingException");
	 throw new NamingException(null);
 }
 public static void method35()throws RemarshalException{
	 System.out.println("running RemarshalException");
	 throw new RemarshalException();
 }
 
 public static void method36() {
	 System.out.println("AssertionError");
	 throw new AssertionError();
 }
 public static void method37() {
	 System.out.println("AWTError,");
	 throw new AWTError(null);
 }
 public static void method38() {
	 System.out.println("AnnotationFormatError,");
	 throw new AnnotationFormatError("wehe");
 }
 public static void method39() {
	 System.out.println("ServiceConfigurationError,");
	 throw new ServiceConfigurationError("nbdjd");
 }
 public static void method40() {
	 System.out.println("LinkageError,");
	 throw new LinkageError(null);
 }
 public static void method41() {
	 System.out.println("CoderMalfunctionError,");
	 throw new CoderMalfunctionError(null);
 }
 public static void method42() throws MimeTypeParseException {
	 System.out.println("MimeTypeParseException,,");
	 throw new MimeTypeParseException(null);
 }
 public static void method43() throws RefreshFailedException {
	 System.out.println("RefreshFailedException,");
	 throw new RefreshFailedException(null);
 }
 public static void method44() throws SOAPException {
	 System.out.println("SOAPException,");
	 throw new SOAPException();
 }
 public static void method45() throws NotBoundException {
	 System.out.println("NotBoundException,");
	 throw new NotBoundException(null);
 }
 public static void method46() {
	 System.out.println("FactoryConfigurationError,");
	 throw new FactoryConfigurationError();
 }
 public static void method47() {
	 System.out.println("TransformerFactoryConfigurationError,");
	 throw new TransformerFactoryConfigurationError();
 }
 public static void method48() {
	 System.out.println("IOError,");
	 throw new IOError(null);
 }
 public static void method49() {
	 System.out.println("TransformerFactoryConfigurationError,");
	 throw new TransformerFactoryConfigurationError();
 }
 public static void method50() {
	 System.out.println("TransformerFactoryConfigurationError,");
	 throw new TransformerFactoryConfigurationError();
 }
 public static void method52() {
	 System.out.println("ImagingOpException,");
	 throw new ImagingOpException("bdhwguuh");
 }
 public static void method53() {
	 System.out.println("NegativeArraySizeException,");
	 throw new NegativeArraySizeException("bdhwguuh");
 }
 public static void method54() {
	 System.out.println("JSException,");
	 throw new JSException("bdhwguuh");
 }
 public static void method55() {
	 System.out.println(" JMRuntimeException,");
	 throw new  JMRuntimeException("bdhwguuh");
 }
 public static void method56() {
	 System.out.println("UndeclaredThrowableException,");
	 throw new UndeclaredThrowableException(null, "bdhwguuh");
 }
 public static void method57() {
	 System.out.println(" UnmodifiableModuleException,,");
	 throw new  UnmodifiableSetException();
	 
 }
 public static void method58() throws InvalidAlgorithmParameterException {
	 System.out.println(" InvalidAlgorithmParameterException,,");
	 throw new  InvalidAlgorithmParameterException();
	 
 }
 public static void method59() throws InvalidActivityException {
	 System.out.println(" InvalidActivityException,,");
	 throw new  InvalidActivityException();
	 
 }
 public static void method60() throws InvalidDataException {
	 System.out.println(" InvalidDataException,,,");
	 throw new  InvalidDataException();
	 
 }
 public static void metho61() {
	 System.out.println(" UnsupportedAddressTypeException,,");
	 throw new  UnsupportedAddressTypeException();
	 
 }
 public void exceptionCretion62() throws IOException
	{
		System.out.println("running exceptionCretion20");
		throw new IOException();
	}
	public void exceptionCretion63() throws JAXBException
	{
		System.out.println("running exceptionCretion21");
		throw new JAXBException("jax");
	}
	public void exceptionCretion64() throws JMException
	{
		System.out.println("running exceptionCretion22");
		throw new JMException();
	}
	public void exceptionCretion65()throws JMException
	{
		System.out.println("running exceptionCretion22");
		throw new JMException();
	}
	public void exceptionCretion66() throws KeySelectorException
	{
		System.out.println("running exceptionCretion23");
		throw new KeySelectorException();
	}
	public void exceptionCretion67() throws LastOwnerException
	{
		System.out.println("running exceptionCretion24");
		throw new LastOwnerException();
	}
	public void exceptionCretion68() throws LineUnavailableException
	{
		System.out.println("running exceptionCretion25");
		throw new LineUnavailableException();
	}
	public static void method69()throws BufferOverflowException {
		 System.out.println("running printStack");
		 throw new BufferOverflowException();
	 }
	 public  static void method70()throws BufferUnderflowException {
		 System.out.println("running BufferUnderflowException");
		 throw new BufferUnderflowException();
	 }
	 public void exceptionCretion71() throws MarshalException
		{
			System.out.println("running exceptionCretion26");
			throw new MarshalException("marshal");
		}
		public void exceptionCretion72() throws MimeTypeParseException
		{
			System.out.println("running exceptionCretion27");
			throw new MimeTypeParseException();
		}
		public void exceptionCretion73() throws NamingException
		{
			System.out.println("running exceptionCretion28");
			throw new NamingException();
		}
		public void exceptionCretion74() throws NotBoundException
		{
			System.out.println("running exceptionCretion29");
			throw new NotBoundException();
		}
		public void data75()
		{
			System.out.println("running data14");
			throw new FileSystemNotFoundException();
		}
		public void data76()
		{
			System.out.println("running data15");
			throw new IllegalArgumentException();
		}
		public void data77()
		{
			System.out.println("running data16");
			throw new IllegalMonitorStateException();
		}
		public void data78()
		{
			System.out.println("running data17");
			throw new IllegalPathStateException();
		}
		public void exceptionCretion79() throws ParseException
		{
			System.out.println("running exceptionCretion31");
			throw new ProviderException();
		}
		public void exceptionCretion80() throws PrinterException
		{
			System.out.println("running exceptionCretion32");
			throw new PrinterException();
		}
		public void exceptionCretion81() throws PrintException
		{
			System.out.println("running exceptionCretion33");
			throw new PrintException();
		}
		public void exceptionCretion82() throws TimeoutException
		{
			System.out.println("running exceptionCretion34");
			throw new TimeoutException();
		}
		public void exceptionCretion83() throws XPathException
		{
			System.out.println("running exceptionCretion35");
			throw new XPathException("path");
			
		}
		public void errorMethod84()
		{
			System.out.println("running errorMethod1");
			throw new AnnotationFormatError("null");
		}
		public static void method85() {
			 System.out.println("FactoryConfigurationError,");
			 throw new FactoryConfigurationError();
		 }
		 public static void method86() {
			 System.out.println("TransformerFactoryConfigurationError,");
			 throw new TransformerFactoryConfigurationError();
		 }
		 public static void method87() {
			 System.out.println("IOError,");
			 throw new IOError(null);
		 }
		 public static void errorMethod88()
			{
				System.out.println("running errorMethod");
				throw new AssertionError();
			}
			public static void errorMethod89()
			{
				System.out.println("running errorMethod");
				throw new CoderMalfunctionError(null);
			}
			public  static void errorMethod90()
			{
				System.out.println("running errorMethod");
				throw new FactoryConfigurationError();
			}
			public  static void errorMethod91()
			{
				System.out.println("running errorMethod");
				throw new LinkageError();
			}
			public static void errorMethod92()
			{
				System.out.println("running errorMethod6");
				throw new ServiceConfigurationError("hbjw");
			}
			public static void errorMethod93()
			{
				System.out.println("running errorMethod7");
				throw new ThreadDeath();
			}
			public static void errorMethod94()
			{
				System.out.println("running errorMethod");
				throw new TransformerFactoryConfigurationError();
			}
			public static void errorMethod95()
			{
				System.out.println("running errorMethod95");
				throw new InternalError();
			}
			public static void errorMethod96()
			{
				System.out.println("running errorMethod96");
				throw new OutOfMemoryError();
			}
			public static void errorMethod97()
			{
				System.out.println("running errorMethod97");
				throw new StackOverflowError();
			}
			public static void errorMethod98()
			{
				System.out.println("running errorMethod");
				throw new UnknownError();
			}
			public static void errorMethod99()
			{
				System.out.println("running errorMethod99");
				throw new AWTError(null);
			}
			public static void errorMethod100()
			{
				System.out.println("running errorMethod100");
				throw new TransformerFactoryConfigurationError();
			}

}
    



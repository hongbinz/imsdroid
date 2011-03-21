/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class ProxyVideoProducer extends ProxyPlugin {
  private long swigCPtr;

  public ProxyVideoProducer(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.ProxyVideoProducer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ProxyVideoProducer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_ProxyVideoProducer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int getRotation() {
    return tinyWRAPJNI.ProxyVideoProducer_getRotation(swigCPtr, this);
  }

  public void setRotation(int rot) {
    tinyWRAPJNI.ProxyVideoProducer_setRotation(swigCPtr, this, rot);
  }

  public int push(java.nio.ByteBuffer buffer, long size) {
    return tinyWRAPJNI.ProxyVideoProducer_push(swigCPtr, this, buffer, size);
  }

  public int send(java.nio.ByteBuffer buffer, long size, long duration, boolean marker) {
    return tinyWRAPJNI.ProxyVideoProducer_send(swigCPtr, this, buffer, size, duration, marker);
  }

  public void setCallback(ProxyVideoProducerCallback _callback) {
    tinyWRAPJNI.ProxyVideoProducer_setCallback(swigCPtr, this, ProxyVideoProducerCallback.getCPtr(_callback), _callback);
  }

  public java.math.BigInteger getMediaSessionId() {
    return tinyWRAPJNI.ProxyVideoProducer_getMediaSessionId(swigCPtr, this);
  }

  public static boolean registerPlugin() {
    return tinyWRAPJNI.ProxyVideoProducer_registerPlugin();
  }

  public static void setDefaultChroma(tmedia_chroma_t chroma) {
    tinyWRAPJNI.ProxyVideoProducer_setDefaultChroma(chroma.swigValue());
  }

}

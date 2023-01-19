
package com.ony.practicas;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteMethods extends Remote{
    public double AddRemote(double a, double b) throws RemoteException;
    public double SubRemote(double a, double b) throws RemoteException;
    public double MulRemote(double a, double b) throws RemoteException;
    public double DivRemote(double a, double b) throws RemoteException;
}

package com.example.wifi_configuration.connect;


import android.net.wifi.ScanResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;


public interface ConnectionScanResultsListener
{
    @Nullable
    ScanResult onConnectWithScanResult(@NonNull List<ScanResult> scanResults);
}

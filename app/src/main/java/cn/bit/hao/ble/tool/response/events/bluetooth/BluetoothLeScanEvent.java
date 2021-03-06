/**
 * Copyright (c) www.bugull.com
 */
package cn.bit.hao.ble.tool.response.events.bluetooth;

import cn.bit.hao.ble.tool.response.events.CommonResponseEvent;

/**
 * @author wuhao on 2016/8/8
 */
public class BluetoothLeScanEvent extends CommonResponseEvent {
	private static final String TAG = BluetoothLeScanEvent.class.getSimpleName();

	public enum BluetoothLeScanCode {
		LE_SCAN_TIMEOUT,
		LE_SCAN_FAILED
	}

	private BluetoothLeScanCode bluetoothLeScanCode;

	public BluetoothLeScanEvent(BluetoothLeScanCode bluetoothLeScanCode) {
		this.bluetoothLeScanCode = bluetoothLeScanCode;
	}

	public BluetoothLeScanCode getBluetoothLeScanCode() {
		return bluetoothLeScanCode;
	}

	public void setBluetoothLeScanCode(BluetoothLeScanCode bluetoothLeScanCode) {
		this.bluetoothLeScanCode = bluetoothLeScanCode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("bluetoothLeScanCode: ").append(bluetoothLeScanCode != null ? bluetoothLeScanCode : "null");
		return sb.toString();
	}
}


I have generated the code from the   timewriterapi.wsdl

update host file C:\Windows\System32\drivers\etc\hosts
127.0.0.1	api.timewriter.soap.nl

Generate sources by executing
"C:/Program Files/Java/jdk1.8.0_181/bin/wsimport.exe" http://api.timewriter.soap.nl/wsdl/timewriterapi.wsdl -s D:\Projects\Workspace\TimeWriterAPI\src
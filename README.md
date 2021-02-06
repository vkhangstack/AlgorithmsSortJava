# AlgorithmsSortJava
Những thuật toán sắp xếp trong Java.
Bao gồm:
{
    Bubble sort.
            Phương pháp này sẽ duyệt danh sách nhiều lần, trong mỗi lần duyệt sẽ lần lượt so sánh cặp nút thứ i và thứ i+1 và đổi chỗ hai nút này nếu chúng không đúng thứ tự

    Quick sort.
            uick sort là phương pháp đổi chỗ từng phần (partition exchange), đây là phương pháp rất hiệu quả, rất thông dụng..
            Nội dung của phương pháp này như sau:
            Chọn một nút bất kỳ trong danh sách(Giả sử là nút số 5 như trên hình) gọi là nút làm trục (pivot node), xác định vị trí hợp lệ của nút này trong danh sách (gọi là vị trí pivot).
            Tiếp theo chúng ta phân hoạch các nút còn lại trong danh sách cần sắp xếp sao cho từ vị trí 0 đến vị trí pivot-1 đều có nội dung nhỏ hơn hoặc bằng nút làm trục, các nút từ vị trí pivot+1 đến n-1 đều có nội dung lớn hơn nút làm trục.
            Quá trình lại tiếp tục như thế với hai danh sahs con từ trị trí 0 đến vị trí pivot-1 và từ vị trí pivot+1 đến vị trí n-1, … Sau cùng chúng ta sẽ được danh sách có thứ tự

    Simple selection sort.
            Ý tưởng Thuật Toán selection sort là: Chọn phần tử nhỏ nhất trong n phần tử ban đầu, đưa phần tử này về vị trí đúng là đầu tiên của dãy hiện hành. Sau đó không quan tâm đến nó nữa, xem dãy hiện hành chỉ còn n-1 phần tử của dãy ban đầu, bắt đầu từ vị trí thứ 2. Lặp lại quá trình trên cho dãy hiện hành đến khi dãy hiện hành chỉ còn 1 phần tử. Dãy ban đầu có n phần tử, vậy tóm tắt ý tưởng Thuật Toán là thực hiện n-1 lượt việc đưa phần tử nhỏ nhất trong dãy hiện hành về vị trí đúng ở đầu dãy.

    Heap sort.
    Simple insertion sort.
            nsertion sort là một Thuật Toán sắp xếp đơn giản, nó tạo ra mảng được sắp xếp cuối cùng một phần tử một lúc. Nó kém hiệu quả đối với mảng dữ liệu lớn so với các Thuật Toán sắp xếp khác.
            Ưu điểm của Insertion Sort:
            1) Giải thuật đơn giản, dễ implement
            2) Nó rất hiệu quả cho các bộ dữ liệu nhỏ.
            3) Tính ổn định cao
    Shell sort.
            Shell sort còn được gọi là sắp xếp tăng hẹp, nó là một insertion sort. Là một Thuật Toán bổ sung cho insertion sort.Mỗi row được group bởi các step gap, mỗi group sử dụng insertion sort để sắp xếp, khi step gap giảm các group chứa được nhiều record hơn. Khi giá trị của gap được giảm xuống còn 1 toàn bộ dữ liệu được kết hợp thành một group để tạo thành một bộ dữ liệu đã được sắp xếp.
    Merge sort.
            Các bước để implement Merge Sort:
            1) Chia mảng dữ liệu chưa sort thành n phân vùng, mỗi phân vùng chứa 1 phần tử. Tại đây phần tử được coi đã được sắp xếp.
            2) Lặp đi lặp lại các đơn vị được phân chia để tạo ra một mảng mới cho đến khi chỉ còn lại 1 mảng con. Cuối cùng chúng ta thu được một mảng đã sắp xếp.
    Radix sort.
}
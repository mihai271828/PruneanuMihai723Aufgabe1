    public class King {
        private int Id;
        private String Name;
        private Haus Haus;
        private String Ereigniss;
        private java.sql.Date Date;

        public enum Haus {
            Stark, Lannister, Targaryen, Baratheon, Greyjoy, Martell, Tyrell
        }
        public King(int ID, String Name, King.Haus Haus, String Ereigniss, java.sql.Date Date){
            this.Id = ID;
            this.Name = Name;
            this.Haus = Haus;
            this.Ereigniss = Ereigniss;
            this.Date = Date;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public King.Haus getHaus() {
            return Haus;
        }

        public void setHaus(King.Haus haus) {
            Haus = haus;
        }

        public String getEreigniss() {
            return Ereigniss;
        }

        public void setEreigniss(String ereigniss) {
            Ereigniss = ereigniss;
        }

        public java.sql.Date getDate() {
            return Date;
        }



        public void setDate(java.sql.Date date) {
            Date = date;
        }

        @Override
        public String toString() {
            return "Date{" +
                    "<Date>" + Date + "</Date>"+
                    "<Ereigniss>" + Ereigniss + "</Ereigniss>" +
                    "<Haus>" + Haus + "</Haus>"+
                    "<ID>" + Id + "</ID>" +
                    "<Name>" + Date +"</Name>";
        }

    }



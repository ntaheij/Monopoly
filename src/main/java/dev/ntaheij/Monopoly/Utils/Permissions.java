package dev.ntaheij.Monopoly.Utils;

public enum Permissions {
	PLAYER{
        @Override
        public String asPermission() 
        {
            return "monopoly.player";
        }
    },
	ADMIN{
        @Override
        public String asPermission() 
        {
            return "monopoly.admin";
        }
    };
	
    public abstract String asPermission();
}

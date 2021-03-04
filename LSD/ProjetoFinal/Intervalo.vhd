library IEEE;
use IEEE.STD_LOGIC_1164.all;
use ieee.std_logic_arith.all;
use ieee.numeric_std.all;

entity Intervalo is
port( clk : std_logic;
		key_1 : in std_logic;
		dataIn : in std_logic_vector(9 downto 0);
		reset : in std_logic;
		reg_0 : out std_logic_vector(9 downto 0);
		reg_1 : out std_logic_vector(9 downto 0);
		count : out std_logic);
end Intervalo;

architecture Behavioral of Intervalo is
signal s_count: std_logic:='0';
	
begin
	process(clk)
	begin
		if (rising_edge(clk)) then
			if (reset = '0')then
				s_count <= '0';
				reg_0 <= "0000000000";
				reg_1 <= "0000000000";
			else
				if(s_count = '0') then
					if(key_1 = '1') then
						reg_0 <= dataIn;
						s_count<= '1';
					end if;
				elsif(s_count = '1') then
					if(key_1 = '1') then
						reg_1 <= dataIn;
						s_count<= '0';
					end if;
				end if;
			end if;
		end if;
		
	end process;
	
	count <= s_count;
	
end Behavioral;